package teste.cerradoinformatica.com.br.teste;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MainActivity extends ListActivity {


    private ArrayList<String> listaItens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buscarEventos();
    }

    private void buscarEventos() {
         List<String> lstString = Arrays.asList("Teste","teste2","teste3","teste4","teste5","teste6");
         carregaLista(lstString);

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getBaseContext(),"OK",Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }

    /*@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		l.setClickable(true);
		int item_id = listaEventos.get(position).getId();
		Intent i = new Intent(this, ParticipantesActivity.class);
		Bundle params = new Bundle();
		params.putInt("item_id", item_id);
		i.putExtras(params);
		startActivity(i);
	}*/

    private void carregaLista(List<String> listaItens) {
       setListAdapter(new EventoAdapter(this,listaItens));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        buscarEventos();
    }
}
