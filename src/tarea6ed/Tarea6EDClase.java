package tarea6ed;

public class Tarea6EDClase {
    
    public static final double variable1 = 0.8;
    public static final double variable2 = 0.95;
    
    public void aplicarDescuento(double precioProducto, int numProductos){
        
        double Total;      
        precioProducto -= 5;
        
        if(numProductos > 3){
            
            if (numProductos != 0){
                
                Total = precioProducto * variable1;
                imprimir(Total);
                
        }else {
                
            Total = precioProducto * variable2;
            imprimir(Total);
            
        }
        }
    }   

    private void imprimir(double Total) {
        
        System.out.println("El total a pagar es: " + Total);
        System.out.println("Enviado");
        
    }
}
