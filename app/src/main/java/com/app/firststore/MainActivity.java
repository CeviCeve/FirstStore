package com.app.firststore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.firststore.Adapters.CategoryAdapter;
import com.app.firststore.Adapters.CourseAdapter;
import com.app.firststore.Model.Category;
import com.app.firststore.Model.Course;
import com.app.firststore.Repository.Courses_repository;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.SignInMethodQueryResult;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, courseRecycler;
    CategoryAdapter categoryAdapter;
    CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //startActivities(new Intent(this, Fourth_layer_money.class));
        //Courses_repository.getAll();

        //----1----//
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Alpha"));
        categoryList.add(new Category(2, "Beta"));
        categoryList.add(new Category(3, "Gamma"));

        categoryList.add(new Category(987, "Reset"));

        setCategoryRecycler(categoryList);

        //----2----//
        int course1=200;
        int course2=150;
        int course3=500;
        int course4=100;


        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, String.valueOf(course1) + " BYN","Разработка приложений на Java", "Быстро\nКачественно\nДоступно" ,"Начинающий",R.drawable.gradient_6, "k"));
        courseList.add(new Course(2, String.valueOf(course2) + " BYN","Разработка приложений на Java", "Качественно\nДоступно" ,"Начинающий",R.drawable.gradient_2, "k"));
        courseList.add(new Course(3, String.valueOf(course3) + " BYN","Разработка приложений на Java", "Доступно" ,"Начинающий",R.drawable.gradient_5, "k"));
        courseList.add(new Course(4, String.valueOf(course4) + " BYN","Разработка приложений на Java", "Быстро\nКачественно\nДоступно" ,"Начинающий",R.drawable.gradient_4, "k"));

        setCourseRecycler(courseList);
        


    }

    //----переход к избранному----//
    public void openSecond(View view){
        Intent intent = new Intent(this, SecondLayer.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
    //----переход к чатам----//
    public void openThird(View view){
        Intent intent = new Intent(this, ThirdLayer.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    //----переход к ЛК----//
    public void openFourth(View view){
        Intent intent = new Intent(this, FourthLayer.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    //----2----//
    private void setCourseRecycler(List<Course> courseList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        courseRecycler = findViewById(R.id.recyclerCourse);
        courseRecycler.setLayoutManager(layoutManager);
        courseAdapter = new CourseAdapter(this,courseList);
        courseRecycler.setAdapter(courseAdapter);
    }

    //----1----//
    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryList);
        categoryRecycler.setAdapter(categoryAdapter);
    }
}