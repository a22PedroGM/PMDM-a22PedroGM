package com.example.ud03_1_secretapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val encrypt = EncryptFragmentArgs.fromBundle(requireArguments()).message
        encrypt.uppercase()
        val arraychar = encrypt.toCharArray()
        var iterador = arraychar.iterator()
        var cifrado=""
        while (iterador.hasNext()){
            var valorchar = iterador.nextChar().code+3
            if(valorchar > 'Z'.code){
                valorchar = '@'.code+(valorchar - 'Z'.code)
            }
            cifrado += valorchar.toChar()
        }
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        view.findViewById<TextView>(R.id.encryptedmssg).text = cifrado
        return view
    }
    fun cifrado(message: String) = message.map{
        if(it.isLetter())
            it.uppercaseChar().code.minus('A'.code).plus(3).mod(26).plus('A'.code).toChar()
        else
            it

    }.joinToString("")
}