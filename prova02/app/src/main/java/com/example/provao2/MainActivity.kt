import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import com.example.provao2.MainViewModel
import com.example.provao2.R
import com.example.provao2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewModel que gerencia a lógica de tradução e o estado da UI
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configuração do Data Binding
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        // Configuração do botão de tradução
        binding.translateButton.setOnClickListener {
            viewModel.translateText() // Chama o método translateText() do ViewModel
        }

        // Configuração da ImageView
        binding.logoImageView.setImageResource(R.drawable.ic_logo)

        // Observador para atualizar o texto traduzido na UI
        val translatedTextObserver = Observer<String> { translatedText ->
            binding.translatedText.text = translatedText // Atualiza o texto traduzido na UI usando a variável de ligação
        }

        // Observa as mudanças no texto traduzido no ViewModel
        viewModel.translatedText.observe(this, translatedTextObserver)
    }
}
