package CreationDesignPattern;

public class Song {
    private String name;
    private Song nextSong;

    private  static  boolean flag ;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist(Song first,Song second) {

        if(first.nextSong == second)
        {
            flag = true ;
            return  flag;
        }
        else
        {
            flag = false ;
        }

        return  flag ;
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist(first,second));
    }
}