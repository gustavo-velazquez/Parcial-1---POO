
/**
 *
 * @author Gustavo Velazquez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        //musculos
        musculo m1= new brazo("bicep del brazo","triceps");
        musculo m2=new piernas("femoral","cuadriceps");
        musculo m3=new torso("pectoral mayor","pectoral menor");
        
        //Ejercicios
        estocada estocada = new estocada();//piernas
        Curl_de_biceps curl = new Curl_de_biceps();//brazos
        apertura_de_pecho apertura = new apertura_de_pecho();//torso
        
        //primer usuario necesita entrenar brazo y piernas
        musculo musculos1[] = new musculo[2];
        usuario u1 = new usuario("juan",30,100);
        musculos1[0]=m1;
        musculos1[1]=m2;
        //entrenamiento usuario 1
        
        Object ejer[]=new Object[2];
        ejer[0]=estocada;
        ejer[1]=curl;
        entrenamiento e1 = new entrenamiento("rutina",musculos1,u1);
        e1.genera_entrenamiento_personalizado(ejer);
        System.out.println(e1);
        System.out.println(u1);
        
        
        //Usuario 2
        musculo musculos2[] = new musculo[3];
        usuario u2 = new usuario("Pedro",40,154);
        musculos2[0]=m1;
        musculos2[1]=m2;
        musculos2[2]=m3;
        
        //entrenamiento usuario 2
        
        Object ejer2[]=new Object[3];
        ejer2[0]=estocada;
        ejer2[1]=curl;
        ejer2[2]=apertura;
        entrenamiento e2 = new entrenamiento("rutina2",musculos2,u2);
        e2.genera_entrenamiento_personalizado(ejer2);
        System.out.println("\n----------------------------------------");
        System.out.println(e2);
        System.out.println(u2);
        
        
        //Usuario 2
        musculo musculos3[] = new musculo[1];
        usuario u3 = new usuario("Maria",75,70);
        musculos3[0]=m2;
        
        //entrenamiento usuario 2
        
        Object ejer3[]=new Object[1];
        ejer3[0]=estocada;
        entrenamiento e3 = new entrenamiento("rutina3",musculos3,u3);
        e3.genera_entrenamiento_personalizado(ejer3);
        System.out.println("\n----------------------------------------");
        System.out.println(e3);
        System.out.println(u3);
        
    }
    
}
