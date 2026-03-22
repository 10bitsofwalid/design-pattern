package AbstractFactoryDP3;

// TODO: Define MusicFileFactory class with a static createMusicFile method

    // TODO: Implement the createMusicFile method to utilize a factory to create a music file


public class MusicFileFactory{
    public static MusicFile createMusicFile(MusicFileAbstractFactory factory){
        return factory.createMusicFile();
    }
}
