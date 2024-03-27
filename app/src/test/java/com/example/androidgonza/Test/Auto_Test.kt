package com.example.androidgonza.Test

import com.example.androidgonza.Auto
import org.junit.Test
import org.junit.Assert.*

class Auto_Test {
        @Test
        fun testAuto(/*Test para ver que los atributos sean los asignados*/) {
            val auto1 = Auto("Toyota", "Corolla", 5000)
            assertEquals("Toyota", auto1.getMarca())
            assertEquals("Corolla", auto1.getModelo())
            assertEquals(5000, auto1.getValor())
        }
        @Test
        fun testAutosIguales(/*Test para crear 2 autos y estos sean iguales*/){
            val auto1 = Auto("Ford", "Fiesta", 2000)
            val auto2 = Auto("Ford", "Fiesta", 2000)

            assertEquals(auto1.getMarca(), auto2.getMarca())
            assertEquals(auto1.getModelo(), auto2.getModelo())
            assertEquals(auto1.getValor(), auto2.getValor())
        }
        @Test
        fun testAutosDiferentes(/*Creo 2 autos diferentes y los comparo*/){
            val auto1 = Auto("Ford", "Fiesta", 2000)
            val auto2 = Auto("Toyota", "Hilux", 5000)
            assertNotEquals(auto1.getMarca(), auto2.getMarca())
            assertNotEquals(auto1.getModelo(), auto2.getModelo())
            assertNotEquals(auto1.getValor(), auto2.getValor())
        }
    }
