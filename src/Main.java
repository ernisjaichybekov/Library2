import enums.LIbraryType;
import libray.Crud;
import libray.library;

public class Main {
    public static void main(String[] args) {


        library library = new library("osmonov","kana",3,"Bishkek",LIbraryType .PUBLIC);
        library library2 = new library("Lelina","kana2",4,"jalal abad",LIbraryType .NATIONAL);
        library library3 = new library("Chinghiz AAitmatov","kana3",5,"Osh",LIbraryType .PUBLIC);
        Crud crud = new Crud();
        crud.add(new library[]{library,library2,library3});
        crud.updateById(1,new library("osmonova","kana",3,"Bishkek", LIbraryType.PUBLIC));
        crud.getAllLibrary();
    }
}