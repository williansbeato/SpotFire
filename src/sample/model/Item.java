package sample.model;

public class Item implements Comparable<Item>{
    private String tipo;
    private Album album;
    int posicao_prateleiras;



    public Item(String tipo, Album album) {
        this.tipo = tipo;
        this.album = album;
    }

    @Override
    public int compareTo(Item item) {
        if(this.album.getAutor_banda().getNome().compareTo(item.album.getAutor_banda().getNome())==0){
         return 0;
        }else if(this.album.getAutor_banda().getNome().compareTo(item.album.getAutor_banda().getNome())>0){
            return 1;
        }else{
            return-1;
        }
    }
}
