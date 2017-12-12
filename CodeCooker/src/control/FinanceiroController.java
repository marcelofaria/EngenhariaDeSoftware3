/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorker;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.html.Tags;
import com.itextpdf.tool.xml.net.FileRetrieve;
import com.itextpdf.tool.xml.net.FileRetrieveImpl;
import com.itextpdf.tool.xml.parser.XMLParser;
import com.itextpdf.tool.xml.pipeline.css.CSSResolver;
import com.itextpdf.tool.xml.pipeline.css.CssResolverPipeline;
import com.itextpdf.tool.xml.pipeline.end.PdfWriterPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipeline;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Conta;
import model.ContaDAO;
import model.Item;
import model.ItemDAO;
import model.ItemPedido;
import model.ItemPedidoDAO;
import model.Pedido;
import model.PedidoDAO;
import view.financeiro.GerarRelatorio;
import view.financeiro.PainelFinanceiro;

/**
 *
 * @author Rafael
 */
public class FinanceiroController {

    private PainelFinanceiro tela;
    private GerarRelatorio telaGerar;
    public String HTML;
    public String CSS_DIR;
    public String DEST;

    public FinanceiroController(PainelFinanceiro tela) {

        this.tela = tela;
        tela.addBtnRelatorioListener(new BtnGerarRelatorioPainelListener());
        this.carregarReceitaDoDia();
        this.carregarPratoDoDia();
        this.carregarNumPedidosDoDia();

        this.telaGerar = new GerarRelatorio();
        this.telaGerar.addBtnGerarRelatorioListener(new BtnGerarRelatorioListener());

    }

    public final void carregarReceitaDoDia() {

        ContaDAO cdao = ContaDAO.getInstance();
        Calendar cal = Calendar.getInstance();
        List<Conta> contas = cdao.retrieveGeneric("SELECT * FROM conta WHERE (dataConta BETWEEN '" + String.valueOf(new java.sql.Date(cal.getTimeInMillis())) + "' AND '" + String.valueOf(new java.sql.Date(cal.getTimeInMillis())) + "' );");
        double receitaDoDia = 0;
        for (Conta c : contas) {
            receitaDoDia += c.getValorTotal();
        }

        tela.setReceita(String.valueOf(receitaDoDia));

    }

    public final void carregarPratoDoDia() {

        ItemDAO idao = ItemDAO.getInstance();
        Calendar cal = Calendar.getInstance();
        String data = String.valueOf(new java.sql.Date(cal.getTimeInMillis()));
        String query = "SELECT * FROM item\n"
                + "                       WHERE itemID = (SELECT itemID\n"
                + "               FROM item_pedido\n"
                + "               INNER JOIN pedido ON item_pedido.pedidoID = pedido.pedidoID\n"
                + "               INNER JOIN conta ON pedido.contaID = conta.contaID\n"
                + "               WHERE conta.dataConta BETWEEN '" + data + "' AND '" + data + "'\n"
                + "               GROUP BY itemID\n"
                + "               ORDER BY count(*) DESC\n"
                + "               LIMIT 1)";

        List<Item> itens = idao.retrieveGeneric(query);

        if (!itens.isEmpty()) {
            tela.setPratoDoDia(itens.get(0).getNome());
        } else {
            tela.setReceita("Não houveram pedidos hoje.");
        }

    }

    public final void carregarNumPedidosDoDia() {

        Calendar cal = Calendar.getInstance();
        String data = String.valueOf(new java.sql.Date(cal.getTimeInMillis()));
        String query = "SELECT * FROM item_pedido\n"
                + "INNER JOIN pedido ON pedido.pedidoID = item_pedido.pedidoID\n"
                + "INNER JOIN conta ON pedido.contaID = conta.contaID\n"
                + "WHERE conta.dataConta BETWEEN '" + data + "' AND '" + data + "';";

        ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
        List<ItemPedido> l = ipdao.retrieveGeneric(query);

        tela.setNumPedidos(l.size());

    }

    public void createHTML() {

        try {
            Calendar cal = Calendar.getInstance();
            String data = String.valueOf(new java.sql.Date(cal.getTimeInMillis()));
            String nomeArquivo = "relatorio" + data + ".html";
            int num = 1;
            while (new File(nomeArquivo).exists()) {
                nomeArquivo = new String("relatorio" + data + " (" + num + ").html");
                num++;
            }
            File file = new File(nomeArquivo);
            file.createNewFile();

            PrintStream writer = new PrintStream(new FileOutputStream(nomeArquivo, true));
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("\t<style type=\"text/css\">");

            writer.println("body {    \n"
                    + "    -webkit-background-size: cover;\n"
                    + "    -moz-background-size: cover;\n"
                    + "    -o-background-size: cover;\n"
                    + "    margin: 0px;\n"
                    + "    padding: 0px;\n"
                    + "}");

            writer.println("table, td, th {    \n"
                    + "    border: 1px solid #ddd;\n"
                    + "}");

            writer.println("\t\tth, td {\n"
                    + "    padding: 15px;\n"
                    + "\t\t}");

            writer.println("\t\ttable {\n"
                    + "    border-collapse: collapse;\n"
                    + "    width: 350px;\n"
                    + "\t\t}");

            writer.println("\t\t.divConta {\n"
                    + "    margin: auto;\n"
                    + "    width: 50%;\n"
                    + "    padding: 10px;\n"
                    + "\t\t}");

            writer.println("\t\t#header {\n"
                    + "    font-family: Tahoma;\n"
                    + "    font-size: 16px;\n"
                    + "    padding: 30px;\n"
                    + "    margin: 0px;\n"
                    + "    background-color: #6fa5fc;\n"
                    + "\t\t}");

            writer.println("\t</style>");
            writer.println("</head>");

            writer.println("<body>");

            writer.println("\t<div id=\"header\">");
            writer.println("\t\t<h1 style=\"font-size: 200%;\">Relatório financeiro</h1>");
            writer.println("\t\t<p style=\"padding: 1px; margin: 1px;\">De " + telaGerar.getDataInicial() + " até " + telaGerar.getDataFinal() + "</p>");
            writer.println("\t</div>");

            ContaDAO cdao = ContaDAO.getInstance();
            List<Conta> contas = cdao.retrieveGeneric("SELECT * FROM conta WHERE (dataConta BETWEEN '" + telaGerar.getDataInicial() + "' AND '" + telaGerar.getDataFinal() + "')");
            for (Conta c : contas) {
                String status;
                if (c.getStatus()) {
                    status = "Aberta";
                } else {
                    status = "Fechada";
                }

                writer.println("\t<div class=\"divConta\" style=\"padding-top: 40px;\">");
                PedidoDAO pdao = PedidoDAO.getInstance();
                List<Pedido> pedidos = pdao.retrieveGeneric("SELECT * FROM pedido WHERE contaID = " + c.getId() + ";");
                writer.println("\t\t<h3 style=\"margin-top: 10%; font-weight: bold;\">Conta de " + String.valueOf(new java.sql.Date(c.getData().getTimeInMillis())) + "</h3>");
                writer.println("\t\t<table class=\"pedidos\">");
                writer.println("\t\t\t<tr>");
                writer.println("\t\t\t\t<th style=\"text-align: left\">");
                writer.println("\t\t\t\t\tPedido");
                writer.println("\t\t\t\t</th>");
                writer.println("\t\t\t\t<th>");
                writer.println("\t\t\t\t\tQuantidade");
                writer.println("\t\t\t\t</th>");
                writer.println("\t\t\t\t<th>");
                writer.println("\t\t\t\t\tValor");
                writer.println("\t\t\t\t</th>");
                writer.println("\t\t\t</tr>");
                for (Pedido p : pedidos) {
                    ItemPedidoDAO ipdao = ItemPedidoDAO.getInstance();
                    List<ItemPedido> itemPedidos = ipdao.retrieveGeneric("SELECT * FROM item_pedido WHERE pedidoID = " + p.getId() + ";");
                    for (ItemPedido ip : itemPedidos) {
                        writer.println("\t\t\t<tr>");
                        writer.println("\t\t\t\t<td>");
                        writer.println("\t\t\t\t\t" + ip.getItem().getNome());
                        writer.println("\t\t\t\t</td>");
                        writer.println("\t\t\t\t<td style=\"text-align: right\">");
                        writer.println("\t\t\t\t\t" + ip.getQtd());
                        writer.println("\t\t\t\t</td>");
                        writer.println("\t\t\t\t<td style=\"text-align: right\">");
                        writer.println("\t\t\t\t\t" + ip.getValor());
                        writer.println("\t\t\t\t</td>");
                        writer.println("\t\t\t</tr>");
                    }
                }
                writer.println("\t\t\t<tr>");
                writer.println("\t\t\t\t<td style=\"font-weight: bold\" class=\"total\" colspan=\"3\">");
                writer.println("\t\t\t\t\tTOTAL:    R$ " + c.getValorTotal());
                writer.println("\t\t\t\t</td>");
                writer.println("\t\t\t</tr>");
                writer.println("\t\t</table>");
                writer.println("\t</div>");
            }

            writer.println("</body>");
            writer.println("</html>");
            writer.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FinanceiroController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FinanceiroController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void createPdf(String file) throws IOException, DocumentException {
        // step 1
        Document document = new Document();

        // step 2
        Calendar cal = Calendar.getInstance();
        String data = String.valueOf(new java.sql.Date(cal.getTimeInMillis()));
        int num = 1;
        while (new File(file).exists()) {
            file = new String("relatorio" + data + " (" + num + ").pdf");
            num++;
        }
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
        writer.setInitialLeading(12.5f);
        // step 3
        document.open();
        // step 4

        // CSS
        CSSResolver cssResolver
                = XMLWorkerHelper.getInstance().getDefaultCssResolver(false);
        FileRetrieve retrieve = new FileRetrieveImpl(this.CSS_DIR);
        cssResolver.setFileRetrieve(retrieve);

        // HTML
        HtmlPipelineContext htmlContext = new HtmlPipelineContext(null);
        htmlContext.setTagFactory(Tags.getHtmlTagProcessorFactory());
        htmlContext.autoBookmark(false);

        // Pipelines
        PdfWriterPipeline pdf = new PdfWriterPipeline(document, writer);
        HtmlPipeline html = new HtmlPipeline(htmlContext, pdf);
        CssResolverPipeline css = new CssResolverPipeline(cssResolver, html);

        // XML Worker
        XMLWorker worker = new XMLWorker(css, true);
        XMLParser p = new XMLParser(worker);
        p.parse(new FileInputStream(this.HTML));

        // step 5
        document.close();
    }

    class BtnGerarRelatorioPainelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            telaGerar.setVisible(true);
        }

    }

    class BtnGerarRelatorioListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            createHTML();

            Calendar cal = Calendar.getInstance();
            String data = String.valueOf(new java.sql.Date(cal.getTimeInMillis()));
            String nomeArquivo = "relatorio" + data;
            int num = 1;
            while (new File(nomeArquivo).exists()) {
                nomeArquivo = new String("relatorio" + data + " (" + num + ")");
                num++;
            }

            HTML = nomeArquivo + ".html";
            CSS_DIR = "resources/";
            DEST = nomeArquivo + ".pdf";

            try {
                createPdf(DEST);
                //JOptionPane.showMessageDialog(null, "Relatório criado com sucesso.");
            } catch (IOException | DocumentException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao exportar PDF.");
                Logger.getLogger(FinanceiroController.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
