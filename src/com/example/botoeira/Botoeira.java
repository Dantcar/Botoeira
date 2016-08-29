/**
 * Exercicio2 disciplina Dispositivos Móveis
 * Fatec Ipiranga
 * Professor Cesar Fernandes
 * Aluno: Décio Antonio de Carvalho
 * 
 * Exercício: Criar uma aplicação que simule uma
 * Calculadora com a operação Adição
 * 
 * 
 */


package com.example.botoeira;

import com.example.botoeira.R;
//import com.example.botoeira.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Botoeira extends Activity {

	//aqui variaveis 
	private TextView tvVisor;
	private String texto="";
	private String hint="0";
	private String valorInicial="";
	private int operacao = 0;
	private String resultado = "";
	boolean flag = true;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.l_botoeira);
		//aqui as variaveis da tela de layout
		tvVisor = (TextView) findViewById(R.id.tvVisor);
		
	}
	
	public void teclaUm(View v){
	int end = 0;
	end = texto.length();
	if (end<14){
	texto = texto + "1";
	tvVisor.setText(texto);
	}
	}
	
	public void teclaDois(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "2";
			tvVisor.setText(texto);
		}
	}
	
	public void teclaTres(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "3";
			tvVisor.setText(texto);
		}
	}
	public void teclaQuatro(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "4";
			tvVisor.setText(texto);
		}
	}
	public void teclaCinco(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "5";
			tvVisor.setText(texto);
		}
	}
	public void teclaSeis(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "6";
			tvVisor.setText(texto);
		}
	}
	public void teclaSete(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "7";
			tvVisor.setText(texto);
		}
	}
	public void teclaOito(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "8";
			tvVisor.setText(texto);
		}
	}
	public void teclaNove(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "9";
			tvVisor.setText(texto);
		}
	}
	public void teclaZero(View v){
		int end = 0;
		end = texto.length();
		if (end<14){
			texto = texto + "0";
			tvVisor.setText(texto);
		}
	}
	
	public void teclaPonto(View v){
		
		String ponto=".";
		boolean faz = texto.contains(ponto);
		
			if (!faz){
				texto = texto + ".";
				tvVisor.setText(texto);
			}
	}
	
	public void teclaRetrocede(View v){
		int end = 0;
		end = texto.length()-1;
			if (end>-1){
				texto = texto.substring(0, end);
				tvVisor.setText(texto);
				
			}
			if(end==0){
				texto ="0";
				tvVisor.setText(texto);	
			}
							
	}
	
	public void teclaLimparTudo(View v){
		int end = 0;
		end = texto.length()-1;
			if (end>-1){
				texto = "";
				tvVisor.setText(texto);
				tvVisor.setHint(hint);
			}
	}
	public void teclaClear(View v){
		int end = 0;
		end = texto.length()-1;
			if (end>-1){
				texto = "";
				tvVisor.setText(texto);
				tvVisor.setHint(hint);
			}
	}
	
	public void teclaSoma(View v){
		operacao = 1; //soma
	
		if( texto != ""){
			valorInicial = texto;
			
			texto="";
			tvVisor.setHint(hint);
		}
	}
	
	public void teclaSubtrai(View v){
			operacao = 2; //subtrair	
		
		if( texto != ""){
			valorInicial = texto;
	
			texto="";
			tvVisor.setHint(hint);
		}
		
	}
	public void teclaInverteSinal(View v){
		if( texto != ""){
		texto = tvVisor.getText().toString();
		float resulFloat = -1 * Float.parseFloat(texto.toString());
		texto = resulFloat + "";
		tvVisor.setText(texto);
		}
	}
	public void teclaMultiplicar(View v){
		operacao = 3; //multiplicar
		
			if( texto != ""){
				valorInicial = texto;
				
				texto="";
				tvVisor.setHint(hint);
			}
		
	}
	public void teclaDividir(View v){
		operacao = 4; //dividir
		
		if( texto != ""){
			valorInicial = texto;
			
			texto="";
			tvVisor.setHint(hint);
		}
		
	}
	public String calculo(int tipo, String texto){
		float resulFloat = 0;
		switch (tipo){
		case 1:
			resulFloat = Float.parseFloat(valorInicial.toString()) + Float.parseFloat(texto.toString());
			resultado = resulFloat + "";
			break;
		case 2:
			resulFloat = Float.parseFloat(valorInicial.toString()) - Float.parseFloat(texto.toString());
			resultado = resulFloat + "";
			break;
		case 3:
			resulFloat = Float.parseFloat(valorInicial.toString()) * Float.parseFloat(texto.toString());
			resultado = resulFloat + "";
			break;
		case 4:
			if (Float.parseFloat(texto.toString())!= 0){
			resulFloat = Float.parseFloat(valorInicial.toString()) / Float.parseFloat(texto.toString());
			resultado = resulFloat + "";
			
			}
			else{
				resultado = "Error! tecle C";
			}
				
			break;
		default:
			resultado = "0";
			
		}
		return resultado;
	
	}
	
	public void teclaResultado(View v){
		if (tvVisor.getText().toString()!=""){
			texto = calculo(operacao, tvVisor.getText().toString());
			tvVisor.setText(texto);
		}
		
	}
	
	public void teclaSair(View v){
		finish();
	}
	
	
}
