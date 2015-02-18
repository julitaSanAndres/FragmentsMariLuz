package com.mariluz.frangments_pueblos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


/**
 * Esta actividad detectar� el tama�o de la pantalla y variar� en funci�n a esta.
 * En m�viles solo representar� un �nico fragmento de listado, al pulsar un elemento abrir� la actividad Activity_Entrada.
 * En tablets representar� dos fragmentos, el listado a la izquierda y el detalle de la entrada seleccionada a la derecha
 * Implementa el Callback para escuchar que entrada del listado se ha pulsado y cargarla en consecuencia
 */
public class Activity_Principal extends FragmentActivity implements Fragment_Lista.Callbacks {
	
	//Guardar� TRUE si es una pantalla grande y caben dos fragmentos; o FALSE si es una pantalla peque�a y cabe solo un fragmento
	private boolean dosFragmentos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//aparece el listado, y nos lleva a otra activity cada vez que pinchamos un elemento
		setContentView(R.layout.layout_activity_principal_listado);
		//aparecen los dos fagments
		//setContentView(R.layout.layout_activity_principal_dospaneles);
		
		//Se comprueba que exista el framelayout framelayout_contenedor_entrada. Si existe estaremos usando activity_dospaneles.xml, sino estaremos usando activity_listado.xml 
		if (findViewById(R.id.framelayout_contenedor_detalle) != null) {
			// Entra aqu� solo en dise�os para pantallas grandes (es decir, si usamos res/values-large o res/values-sw600dp). Estaremos usando activity_dospaneles.xml
			dosFragmentos = true;
		}
	}

	
	/**
	 * M�todo Callback que escucha cuando un elemento de la lista ha sido pulsado, entonces entra aqu�. Devuelve el ID del elemento de la lista que fue seleccionado
	 */
	@Override
	public void onEntradaSelecionada(String id) {
		if (dosFragmentos) {
			// Si estamos en pantallas grandes, se mostrar� el detalle seleccionado en esta misma actividad remplazando el fragmento del detalle por el nuevo
			Bundle arguments = new Bundle();
			arguments.putString(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
			Fragment_Detalle fragment = new Fragment_Detalle();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_contenedor_detalle, fragment).commit();

		} else {
			// En pantallas peque�as, iniciaremos una nueva actividad con el contenido del elemento seleccionado de la lista
			Intent detailIntent = new Intent(this, Activity_Detalle.class);
			detailIntent.putExtra(Fragment_Detalle.ARG_ID_ENTRADA_SELECIONADA, id);
			startActivity(detailIntent);
		}
	}
}
