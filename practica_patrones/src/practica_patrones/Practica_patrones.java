/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_patrones;

import java.util.ArrayList;
import java.util.List;

public class Practica_patrones {

    public static void main(String[] args) {

        Visualobject triangulo = new Visualobject("triangulo");
        List<Visualobject> vobjects = new ArrayList<>();
        vobjects.add(triangulo);
        Visualobject cuadrado = new Visualobject("cuadrado", vobjects);
        Visualobject circulo = new Visualobject("circulo");
        //List<Visualobject> objects = new ArrayList<>();4
        List<Visualobject> objects = new ArrayList<>();
        objects.add(cuadrado);
        objects.add(circulo);
        Layer capa = new Layer(0, objects, null);
        System.out.println(capa.visualobjects.get(0).toString());
    }

}
