package com.yahyrparedes.viewmodellivedatabindingjava.viewmodel;

import androidx.lifecycle.ViewModel;

public class SumarViewModel extends ViewModel {

    private int resultado;

    public int getResultado(){
        return resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }
}
