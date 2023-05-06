package crudmvc;

import Controlador.CtrlCliente;
import Modelo.Cliente;
import Modelo.ConsultasCliente;
import Vista.frmProducto;


public class CRUDMVC {

       public static void main(String[] args) {

        Cliente mod = new Cliente();
        ConsultasCliente modC = new ConsultasCliente();
        frmProducto frm = new frmProducto();
        CtrlCliente ctrl = new CtrlCliente(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
