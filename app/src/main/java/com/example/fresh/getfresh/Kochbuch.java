package com.example.fresh.getfresh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import com.example.fresh.getfresh.helpjars.Rezept;
import com.example.fresh.getfresh.helpjars.MyDatabase;


public class Kochbuch extends AppCompatActivity implements AdapterView.OnItemClickListener {


    public ArrayList<Rezept> rezeptliste= new ArrayList<Rezept>();
    private int kilojule;
    public int rnr;

    private ListView list;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kochbuch);

        ladeRezepte();

        arrayList=new ArrayList<String>();
        list = (ListView) findViewById(R.id.rlist);
        list.setOnItemClickListener(Kochbuch.this);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.rlist_item, arrayList);
        list.setAdapter(adapter);

        for(int i=0;i<rezeptliste.size();i++){
            arrayList.add(rezeptliste.get(i).getName());
        }
        adapter.notifyDataSetChanged();
    }


    private void ladeRezepte(){
        //test
        /*Rezept r1= new Rezept("Marmorkuchen",500,"300 g	Butter, weich\n270 g	Zucker\n1 Beutel	Vanillezucker\n1 Fläschchen	Rumaroma\n1 Prise(n)	Salz\n5 	Ei(er)\n375 g	Weizenmehl\n12 g	Backpulver\n3 EL	Milch\n20 g	Kakaopulver\n20 g	Zucker\n3 EL	Milch\nPuderzucker zum Bestäuben","Weiche Butter geschmeidig rühren, nach und nach Zucker, Vanillezucker, Rumaroma und Salz zugeben und solange rühren, bis eine gebundene Masse entstanden ist. Die Eier einzeln einrühren. Mehl und Backpulver vermischen und abwechseln esslöffelweise mit der Milch einrühren. Nur so viel Milch verwenden, dass der Teig schwer reißend von einem Löffel fällt. 2/3 des Teigs in eine Marmorkuchenform füllen. Kakao und Zucker vermischen, die Milch einrühren und unter den restlichen Teig rühren. Den dunklen Teig auf dem hellen verteilen und mit einer Gabel spiralförmig durch die Teigschichten ziehen. Den erkalteten Kuchen mit Puderzucker bestäuben.",80,"marmorkuchen");
        Rezept r2 = new Rezept("Spaghetti Bolognese", 760,"1 Zwiebel(n)\n1 ZeheKnoblauch\n1 Möhre(n)\n500 g  Hackfleisch (Rinderhack oder Tartar)\nSalz und Pfeffer\n200 ml  Gemüsebrühe (Instant)\n1 kl. Dose/nTomatenmark\n1 TL  Oregano\n1 Pck.  Tomate(n), gestückelt, mit Kräutern (etwa 400 g)\n2 ELTomatenketchup\n500 g Nudeln (Spaghetti)","Zwiebel, Knoblauch und Möhre schälen und in feine Würfel schneiden. Hackfleisch in die Pfanne geben, langsam erhitzen und im eigenen Fett unter Rühren anbraten. Salzen und pfeffern. Zwiebeln, Knoblauch und Möhren dazugeben und kurz mitbraten. Mit der Brühe ablöschen, Tomatenmark, Oregano, die gestückelten Tomaten und Tomatenketchup unterrühren. Etwa 40 Minuten einkochen lassen.\nSpaghetti in Salzwasser bissfest kochen, abgießen, abschrecken und zusammen mit der Sauce servieren.",20,"spaghetti");
        rezeptliste.add(r1);
        rezeptliste.add(r2);

        Rezept r3 = new Rezept("Mehr Rezepte",0,"Für mehr Rezepte Premium Version kaufen.","",0,"premium");
        rezeptliste.add(r3);*/
        //test ende
        MyDatabase db = new MyDatabase(this);
        rezeptliste=db.getRezepte();


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Rezept iRezept=rezeptliste.get((int)id);
        //System.out.println(iRezept.info());
        Intent intent = new Intent(getApplicationContext(), Rezept_Info.class);
        Bundle b = new Bundle();
        b.putString("rezept",giveRezept((int)id).info());
        b.putString("bild",giveRezept((int)id).getBild());
        intent.putExtras(b);
        startActivity(intent);
    }

    public Rezept giveRezept(int id){
        return rezeptliste.get(id);
    }
}
