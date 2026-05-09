/**
 * GOOD: 2 Remote types × 2 Device types — only 4 classes total, not 4 combo classes.
 * Adding Projector = one new Device. Adding VoiceRemote = one new Abstraction.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Basic remote with TV ===");
        RemoteControl tvRemote = new RemoteControl(new Tv());
        tvRemote.togglePower();
        tvRemote.volumeUp();
        tvRemote.volumeUp();

        System.out.println("\n=== Advanced remote with Radio ===");
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(new Radio());
        radioRemote.togglePower();
        radioRemote.volumeUp();
        radioRemote.mute();
        radioRemote.mute(); // unmute

        System.out.println("\n=== Advanced remote with TV (mix freely) ===");
        new AdvancedRemoteControl(new Tv()).togglePower();

        System.out.println("\nSuccess: remotes and devices vary independently.");
    }
}
