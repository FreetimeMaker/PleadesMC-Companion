package com.freetime.pmcc.ui.links;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.freetime.pmcc.databinding.FragmentLinksBinding;

public class LinksFragment extends Fragment {

    private FragmentLinksBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LinksViewModel notificationsViewModel =
                new ViewModelProvider(this).get(LinksViewModel.class);

        binding = FragmentLinksBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button discordBTN = binding.discordBTN;
        discordBTN.setOnClickListener(v -> {
            String url = "https://discord.com/invite/"; // URL of the Discord invite to PleadesMC
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}