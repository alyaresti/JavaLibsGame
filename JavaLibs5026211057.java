import javax.swing.JOptionPane;
public class JavaLibs5026211132{
    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,
            "HALO!\nSelamat Datang!\nDisini saya ingin bertanya beberapa hal ke kamu!",
            "JAVALIBS GAME ALYA!!!",
            1);

        String input1 = (String)JOptionPane.showInputDialog(null,
            "Nama kamu siapa?",
            "NAMA",
            2,
            null,
            null,
            "Type something here..");


         int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa umur kamu?",
            "integer"));
        
        JOptionPane.showMessageDialog(null,
            "Halo "+ input1 + "(" +input2+ ")");
        

        JOptionPane.showMessageDialog(null,
            "Sekarang Kita lanjut ke pertanyaan berikutnya ya!");
        

        String[] acceptableValues = {"Comedy", "Romance", "Thriller", "Si-Fi"};
        String input3 = (String)JOptionPane.showInputDialog(null,
            "Kamu suka drama atau film bergenre apa?",
            "Genre",
            2,
            null,
            acceptableValues,
            acceptableValues[1]);

        String input4 = (String)JOptionPane.showInputDialog(null,
            "Biasanya berapa lama kamu menonton drama atau film dalam sehari?",
            "Durasi",
            2,
            null,
            null,
            "Type something here..");

	 String input5 = (String)JOptionPane.showInputDialog(null,
            "Apa drama atau film kesukaan mu?",
            "Drama atau Film",
            2,
            null,
            null,
            "Type something here..");

	    String input6 = (String)JOptionPane.showInputDialog(null,
            "Apa alasan kamu suka dengan "+input5+ "?",
            "Alasan suka",
            2,
            null,
            null,
            "Type something here..");

	  int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa nilai yang kamu berikan ke drama atau film tersebut?",
            "Pick a number between 1-10"));
        
        String input8 = (String)JOptionPane.showInputDialog(null,
            "Mengapa kamu memberi nilai tersebut?",
            "Nilai",
            2,
            null,
            null,
            "Type something here..");


        String input9 = (String)JOptionPane.showInputDialog(null,
            "Siapa aktor atau aktris kesukaan mu?",
            "Aktor atau Aktris",
            2,
            null,
            null,
            "Type something here..");

       String input10 = (String)JOptionPane.showInputDialog(null,
            "Apa alasan kamu suka dengan "+input9+ "?",
            "Alasan suka",
            2,
            null,
            null,
            "Type something here..");

	  int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Berapa nilai yang kamu berikan ke Aktor atau Aktris tersebut?",
            "Pick a number between 1-10"));
        
        String input12 = (String)JOptionPane.showInputDialog(null,
            "Mengapa kamu memberi nilai tersebut?",
            "Nilai",
            2,
            null,
            null,
            "Type something here..");



       

      

        JOptionPane.showMessageDialog(null,
          "Yaa, sekarang aku paham!\n"+input1+ " sangat suka drama atau film bergenre "+input3+"!\nkemudian biasanya kamu menonton drama atau film selama "+input4+"\nKamu juga sangat suka menonton drama atau film yang berjudul "+input5+".\nTernyata alasan kamu suka "+input5+" adalah karena drama atau film tersebut "
            +input6+". Kemudian kamu menilai "+input5+" dengan nilai sebesar "+num2+"! dengan alasan "+input8+".\nAktor atau Aktis favorit kamu ternyata "+input9+".\nTernyata alasan kamu suka "+input9+" adalah karena Aktor atau aktris tersebut "
            +input10+". Kemudian kamu menilai "+input9+" dengan nilai sebesar "+num3+"! dengan alasan "+input12+".\nYaa! senang berkenalan denganmu!\nSampai Jumpa Lagi!!!"
            );
    }    
    
}

 