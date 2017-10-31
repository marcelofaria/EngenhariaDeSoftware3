/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.util.ArrayList;
import java.util.List;
import steps.CadastroSteps;
/**
 *
 * @author Marcelo
 */
public class Stories extends Basestories{

    /**
     *
     * @return
     */
    @Override
    protected List<Object> createSteps() {
        List<Object> steps = new ArrayList<>();
        steps.add(new CadastroSteps());
        return steps;
    }
    
    @Override
    public void run() throws Throwable{
    
        super.run();
    }
    
}
