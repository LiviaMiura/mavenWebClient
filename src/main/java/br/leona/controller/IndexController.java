/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;


/**
 *
 * @author Jean Negrão
 */
@Resource
public class IndexController {
    private Result result;
    public IndexController(Result result){
        this.result = result;        
    }    
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){   
       java.util.List<br.leona.controller.Servico> servicos = GetListService();
        result                 
                .include("listService", GetListService())
                .forwardTo("index.jsp");
    }    
    

    
    
    private static java.util.List<br.leona.controller.Servico> GetListService() {
        br.leona.controller.ServicosController_Service service = new br.leona.controller.ServicosController_Service();
        br.leona.controller.ServicosController port = service.getServicosControllerPort();
        return port.getListService();
    }

}
