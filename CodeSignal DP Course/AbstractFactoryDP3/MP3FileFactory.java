package AbstractFactoryDP3;

// TODO: Define MP3FileFactory class which implements MusicFileAbstractFactory

    // TODO: Implement the createMusicFile method to return a new MP3File instance


public class MP3FileFactory implements MusicFileAbstractFactory{
    public  MusicFile createMusicFile(){
        return new MP3File();
    }
}