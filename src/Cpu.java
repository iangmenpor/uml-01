public class Cpu {
   //ESTA CLASE ESTA AÑADIDA EN GIT.
   //Estados, atributos, propiedades
   public String brand;
   public String model;
   private Double cost;
   // El comando Double son para nª con decimales. pero para numeros enteros se usa Integer

   // Comportamiento o método (funciones)
   // public(+) método accesible desde cualquier clase
   // String: tipo devuelto por el método
   public String getFullName(){
      return brand + " " + model + " " + cost;
   // para contatenar usamos la "+" ejem: brand + model + cost
   // si quieres poner espacios para que no se muestre junto es con " " por medio
   // las cadenas van siempre con coble comillas "", no es lo mismo sin la comilla. es un numero entero y no sirve para string
   }
   public String getBrand(){
      return brand;
   }
   public String getModel(){
      return model;
   }
   private Double getCost(){
      return cost;
   }

}

//Esto es la codificación del diagrama Cpu en Lucid.app
