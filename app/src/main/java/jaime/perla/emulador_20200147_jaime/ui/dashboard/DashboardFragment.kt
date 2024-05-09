package jaime.perla.emulador_20200147_jaime.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.R
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import jaime.perla.emulador_20200147_jaime.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    val nombree="Jaime Perla"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(jaime.perla.emulador_20200147_jaime.R.layout.fragment_contactanos,container,false)
        //llamar
        val imprimirr = root.findViewById<Button>(jaime.perla.emulador_20200147_jaime.R.id.btnImprimir)
        imprimirr.setOnClickListener {
            Toast.makeText(context, nombree, Toast.LENGTH_LONG).show()
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}