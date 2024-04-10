
package Constructora.com.jdbc;

import javax.swing.JOptionPane;

public class clsIngreso {
    
    private String usuario;
    private String contraseña;

    public clsIngreso() {
    }

    public clsIngreso(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    public boolean IngreseUsuario(clsIngreso i){
       
        if(usuario.toUpperCase().equals("RODOLFO")&& contraseña.toUpperCase().equals("DELGADO")){
            
            return true;
            
        }else{
       
            return false;
        }
        
    }
    
}
