package co.infinum.mjolnirrecyclerview;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import java.util.List;

public abstract class MjolnirViewHolder<E> extends RecyclerView.ViewHolder {

    public MjolnirViewHolder(View itemView) {
        super(itemView);
    }

    protected abstract void bind(E item, int position, List<Object> payloads);
}
