package srjlove.com.androidpractice;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImageView, mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView)findViewById(R.id.imageView1);
        mImageView2 = (ImageView)findViewById(R.id.imageView2);

        Bitmap mBitmap1 = BitmapFactory.decodeResource(this.getResources(),R.drawable.wol);
        Bitmap image1 =  ImageConvertor.getRoundedCornerBitmap(mBitmap1,100);

        Bitmap mBitmap2 = BitmapFactory.decodeResource(this.getResources(),R.drawable.img3);
        Bitmap image2 =  ImageConvertor.getRoundedCornerBitmap(mBitmap2,100);

        mImageView.setImageBitmap(image1);
        mImageView2.setImageBitmap(image2);

    }
}
