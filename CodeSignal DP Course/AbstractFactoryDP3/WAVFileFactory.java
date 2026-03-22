package AbstractFactoryDP3;

// TODO: Define WAVFileFactory class which implements MusicFileAbstractFactory

    // TODO: Implement the createMusicFile method to return a new WAVFile instance


public class WAVFileFactory implements MusicFileAbstractFactory{
    public MusicFile createMusicFile(){
        return new WAVFile();
    }
}