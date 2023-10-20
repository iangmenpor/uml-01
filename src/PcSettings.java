import java.util.ArrayList;

public class PcSettings {

    private String id;
    private String date;
    private MotherBoard motherboard;
    private Cpu cpu = null;  //Para darle valor; '... cpu = null;'
    private User user;

    private ArrayList<RAM> ram; //Esto es debio a que es (1,N). N se transcribe como 'List'

}
