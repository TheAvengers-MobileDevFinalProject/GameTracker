package edu.ualr.gametrackerproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import edu.ualr.gametrackerproject.model.Game;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private List<Game> mGames;

    public GameAdapter(List<Game> games) {
        mGames = games;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_game, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        Game game = mGames.get(position);
        holder.bind(game);
    }

    @Override
    public int getItemCount() {
        return mGames.size();
    }

    class GameViewHolder extends RecyclerView.ViewHolder {

        private TextView mGameTitleTextView;
        private TextView mPriceTextView;
        private TextView mPlatformTextView;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            mGameTitleTextView = itemView.findViewById(R.id.game_title_text_view);
            mPriceTextView = itemView.findViewById(R.id.price_text_view);
            mPlatformTextView = itemView.findViewById(R.id.platform_text_view);
        }

        public void bind(Game game) {
            mGameTitleTextView.setText(game.getMgameTitle());
            mPriceTextView.setText(game.getMprice());
            mPlatformTextView.setText(game.getMplatform());
        }
    }
}

