package my.company.animal;

public class Prueba {
    public static void main(String[] args) {
    Animal[] animales = new Animal[4]; 
    animales[0] = new Gato();
    animales[1] = new Perro();
    animales[2] = new Lobo();
    animales[3] = new León();
    
        for (Animal animale : animales) {
            System.out.println(animale.getNombreCientífico());
            System.out.println("Sonido: " + animale.getSonido());
            System.out.println("Alimentos: " + animale.getAlimentos());
            System.out.println("Hábitat: " + animale.getHábitat());
            System.out.println();
        }
    }
    
}