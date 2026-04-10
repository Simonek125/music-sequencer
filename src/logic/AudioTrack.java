package logic;

import java.util.ArrayList;
import java.util.List;

public abstract class AudioTrack implements Playable {
    protected String instrumentName;
    protected int volume;

    protected List<Integer> notes = new ArrayList<>();

    public AudioTrack(String name){
        this.instrumentName = name;
    }
}
