package AbstractFactoryDP3;

public class Main {
    public static void main(String[] args) {
        // Create an MP3 File
        // TODO: Create an MP3File using MusicFileFactory and the respective factory
        // TODO: Call play method on the created MP3File

        // Create a WAV File
        // TODO: Create a WAVFile using MusicFileFactory and the respective factory
        // TODO: Call play method on the created WAVFile

        // Create a FLAC File
        // TODO: Create a FLACFile using MusicFileFactory and the respective factory
        // TODO: Call play method on the created FLACFile
        
        MusicFile flacFile = MusicFileFactory.createMusicFile(new FLACFileFactory());
        flacFile.play();
        
        MusicFile mp3File = MusicFileFactory.createMusicFile(new MP3FileFactory());
        mp3File.play();
        
        MusicFile wavFile = MusicFileFactory.createMusicFile(new WAVFileFactory());
        wavFile.play();
    }
}
