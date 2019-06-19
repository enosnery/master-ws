// @GENERATOR:play-routes-compiler
// @SOURCE:/home/enos/projects/coletorws/conf/routes
// @DATE:Wed Jun 19 16:28:57 BRT 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseServicoColetorControlador ServicoColetorControlador = new controllers.ReverseServicoColetorControlador(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseServicoColetorControlador ServicoColetorControlador = new controllers.javascript.ReverseServicoColetorControlador(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
