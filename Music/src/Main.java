import model.Artist;
import model.DataSource;
import model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()){
            System.out.println("Can't open dataSource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_ASC);
        if (artists == null){
            System.out.println("No artists!");
            return;
        }
        for (Artist artist: artists){
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist = dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_DESC);

        for (String album: albumsForArtist){
            System.out.println(album);
        }

        List<SongArtist> artistsForSong = dataSource.queryArtistForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);

        if (artistsForSong == null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for (SongArtist artist: artistsForSong){
            System.out.println("Artist name = " + artist.getArtistName() +
                    ", Album name = " + artist.getAlbumName() +
                    ", Track = " + artist.getTrack());
        }

        dataSource.querySongMetadata();

        int count = dataSource.getCount(DataSource.TABLE_SONGS);
        System.out.println("The number of songs is: " + count);

        dataSource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title: ");
        String title = scanner.nextLine();

        List<SongArtist> songArtists = dataSource.querySongInfoView(title);
        //if we give the value: Go Your Own Way" or 1=1 or "
        //we will get all the records of the artist_list view
        //if we use prepared statement we could avoid above error
        if (songArtists.isEmpty()){
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for (SongArtist artist: songArtists){
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }
        dataSource.insertSong("Touch of Grey", "Grateful Dead", "In The Dark", 1);
        dataSource.close();
    }
}
