package com.example.shiftthecity08;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BHK1 extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText t1,t2,t3,t4;
    Button btnAddData,btnViewAll,btnviewUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_h_k1);
        myDb=new DatabaseHelper(this);
        t1=(EditText)findViewById(R.id.smallitembhk1);
        t2=(EditText)findViewById(R.id.normalitembhk1);
        t3=(EditText)findViewById(R.id.bigitembhk1);
        t4=(EditText)findViewById(R.id.idbhk1);
        btnAddData=(Button)findViewById(R.id.adddatabhk1);
        btnViewAll=(Button)findViewById(R.id.viewallbhk1);
        btnviewUpdate=(Button)findViewById(R.id.updatedatabhk1);
        AddData();
        viewAll();
        UpdateData();
    }
    public void UpdateData(){
        btnviewUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         boolean isUpdate=myDb.updateData(t4.getText().toString(),t1.getText().toString(),t2.getText().toString(),t3.getText().toString());
                        if(isUpdate==true)
                            Toast.makeText(BHK1.this, "Data Updated Successful", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(BHK1.this, "Data Not Updated", Toast.LENGTH_LONG).show();


                    }
                }
        );
    }

    public void AddData(){
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        boolean isInserted=myDb.insertData(t1.getText().toString(),t2.getText().toString(),t3.getText().toString(),t4.getText().toString());
                             if(isInserted==true)
                                 Toast.makeText(BHK1.this, "Data Inserted Successful", Toast.LENGTH_LONG).show();
                             else
                                 Toast.makeText(BHK1.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll(){
        btnViewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res=myDb.getAlldata();
                        if(res.getCount()==0)
                        {
                            //Show Message
                            showMessage("Error!","Nothing Found");
                            return;
                        }
                        StringBuffer buffer=new StringBuffer();
                        while(res.moveToNext())
                        {
                            buffer.append("Id :"+res.getString(0)+"\n");
                            buffer.append("Small Items :"+res.getString(1)+"\n");
                            buffer.append("Normal Items:"+res.getString(2)+"\n");
                            buffer.append("Big Items :"+res.getString(3)+"\n");
                        }
                        //Showing All the Data
                        showMessage("DATA",buffer.toString());
                    }
                }
        );
    }
    public void showMessage(String title,String Message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}