package com.example.telegram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



    class CustomAdapter extends BaseAdapter {

        Context context;
        int[] images;
        String[] texts;
        LayoutInflater inflater;

        public CustomAdapter(Context context, int[] images, String[] texts) {
            this.context = context;
            this.images = images;
            this.texts = texts;
            inflater = (LayoutInflater.from(context.getApplicationContext()));
        }


        @Override
        public int getCount() {
            return texts.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.list_view, null);

            ImageView imageView = view.findViewById(R.id.image);
            TextView textView = view.findViewById(R.id.text_view);

            imageView.setImageResource(images[position]);

            textView.setText(texts[position]);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (position) {
                        case 0:
                            Toast.makeText(context.getApplicationContext(), "Person One", Toast.LENGTH_SHORT).show();
                            break;
                        case 1:
                            Toast.makeText(context.getApplicationContext(), "Person two", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Toast.makeText(context.getApplicationContext(), "Person Three", Toast.LENGTH_SHORT).show();
                            break;
                        case 3:
                            Toast.makeText(context.getApplicationContext(), "Person Four", Toast.LENGTH_SHORT).show();
                            break;
                        case 4:
                            Toast.makeText(context.getApplicationContext(), "Person Five", Toast.LENGTH_SHORT).show();
                            break;
                        case 5:
                            Toast.makeText(context.getApplicationContext(), "Person Six", Toast.LENGTH_SHORT).show();
                        case 6:
                            Toast.makeText(context.getApplicationContext(), "Person seven", Toast.LENGTH_SHORT).show();
                            break;
                        case 7:
                            Toast.makeText(context.getApplicationContext(), "Person eight", Toast.LENGTH_SHORT).show();



                    }
                }
            });

            return view;
        }
    }
