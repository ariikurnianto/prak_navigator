package id.ac.itn.pertemuan3_navigator.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import id.ac.itn.pertemuan3_navigator.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
       // final TextView textView = root.findViewById(R.id.text_slideshow);
       // slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           // @Override
          //  public void onChanged(@Nullable String s) {
                //textView.setText(s);
        final EditText edtNama =root.findViewById(R.id.input_nama);
        final EditText edtNim =root.findViewById(R.id.input_nim);
        final EditText edtJurusan =root.findViewById(R.id.input_jur);
        final EditText edtAngkatan =root.findViewById(R.id.input_ang);
        final TextView tvNama = root.findViewById(R.id.output_nama);
        final TextView tvNim = root.findViewById(R.id.output_nim);
        final TextView tvJurusan = root.findViewById(R.id.output_jur);
        final TextView tvAngkatan = root.findViewById(R.id.output_ang);
        final Button btnTampil= root.findViewById(R.id.tampil);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                tvNama.setText(edtNama.getText().toString());
                tvNim.setText(edtNim.getText().toString());
                tvJurusan.setText(edtJurusan.getText().toString());
                tvAngkatan.setText(edtAngkatan.getText().toString());
            }
        });
        return root;
    }
}