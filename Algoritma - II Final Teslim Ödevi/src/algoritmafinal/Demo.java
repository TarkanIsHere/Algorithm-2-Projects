
package algoritmafinal;

public class Demo {
    public static void main(String[] args) {
        HashTable liste = new HashTable();
        liste.put("Tarkan1");
        liste.put("Tarkan2");
        liste.put("Tarkan3");
        liste.put("Tarkan4");
        liste.put("Tarkan5");
        liste.put("Tarkan6");
        liste.put("Tarkan7");
        liste.put("Tarkan8");
        liste.put("Tarkan9");
        liste.put("Tarkan10");
        liste.put("Tarkan11");
        liste.put("Tarkan12");
        liste.put("Tarkan13");
        liste.put("Tarkan14");
        liste.put("Tarkan15");
        liste.put("Tarkan16");
        liste.put("Tarkan17");
        liste.printHashTable();
        liste.delete("Tarkan3");
        liste.delete("Tarkan17");
        liste.delete("Tarkan8");
        liste.printHashTable();
    }


}
