package controllers;

import play.mvc.*;
import utils.*;

public class ServicoColetorControlador extends Controller {

    //retorna itens do conferente
    private final static String LISTA_ENTRADAS = "listaEntradas";
    //entradas ja sincronizadas com o coletor
    private final static String SYNC_ENTRADAS = "syncEntradas";
    //retorna usuarios
    private final static String LISTA_USUARIOS = "listaUsuarios";
    //sincroniza usuarios ja cadastrados
    private final static String SYNC_USUARIOS = "syncUsuarios";
    //retorna enderecamentos em aberto
    private final static String LISTA_ENDERECAMENTOS = "listaEnderecamentos";
    //recebe item conferido do coletor
    private final static String CONFERE_ITEM = "confereItem";
    //recebe item conferido do coletor
    private final static String CONFERE_ITEM_DIFERENCA = "confereItemDiferenca";
    //recebe item confirmado do coletor
    private final static String CONFIRMA_ITEM = "confirmaItem";
    // FAZENDO TRANSFERENCIA
    private final static String FAZER_TRANSFERENCIA = "fazertransferencia";


    // ROTINA DE TRANSFERENCIA
    private final static String LOCALIZAR_PALLET = "buscarPallet";
    //TRANSFERIR PALLET
    private final static String TRANSFERIR_PALLET = "transferirPallet";

    public Result coletor(){
        DebugUtil.d("Teste de Log");
        return ok(views.html.coletor.render(CONFERE_ITEM));
    }

    private static Result retornaEntradas(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String guid = request.getParameter("guid");
        ConferenciaCargaBO bo = new ConferenciaCargaBO();
        String jsonEntradas = bo.retornaEntradasWS(guid);
        response.getWriter().append(jsonEntradas);
        return ok();
    }



}