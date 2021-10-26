package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 0 => player X, 1 => player O
    public int currentPlayer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // if (currentPlayer == 0) {
    //     TextView playerStatus = findViewById(R.id.playerStatus);
    //     playerStatus.setText("Player X's turn");
    // }
    // else {
    //     TextView playerStatus = findViewById(R.id.playerStatus);
    //     playerStatus.setText("Player O's turn");
    // }

    public void btnOneClicked(View view) {
        Button btnOne = findViewById(R.id.btnOne);
        if (btnOne.getText().equals("")) {
            if (currentPlayer == 0) {
                btnOne.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnOne.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnTwoClicked(View view) {
        Button btnTwo = findViewById(R.id.btnTwo);
        if (btnTwo.getText().equals("")) {
            if (currentPlayer == 0) {
                btnTwo.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnTwo.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnThreeClicked(View view) {
        Button btnThree = findViewById(R.id.btnThree);
        if (btnThree.getText().equals("")) {
            if (currentPlayer == 0) {
                btnThree.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnThree.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnFourClicked(View view) {
        Button btnFour = findViewById(R.id.btnFour);
        if (btnFour.getText().equals("")) {
            if (currentPlayer == 0) {
                btnFour.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnFour.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnFiveClicked(View view) {
        Button btnFive = findViewById(R.id.btnFive);
        if (btnFive.getText().equals("")) {
            if (currentPlayer == 0) {
                btnFive.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnFive.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnSixClicked(View view) {
        Button btnSix = findViewById(R.id.btnSix);
        if (btnSix.getText().equals("")) {
            if (currentPlayer == 0) {
                btnSix.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnSix.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnSevenClicked(View view) {
        Button btnSeven = findViewById(R.id.btnSeven);
        if (btnSeven.getText().equals("")) {
            if (currentPlayer == 0) {
                btnSeven.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnSeven.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnEightClicked(View view) {
        Button btnEight = findViewById(R.id.btnEight);
        if (btnEight.getText().equals("")) {
            if (currentPlayer == 0) {
                btnEight.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnEight.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void btnNineClicked(View view) {
        Button btnNine = findViewById(R.id.btnNine);
        if (btnNine.getText().equals("")) {
            if (currentPlayer == 0) {
                btnNine.setText("X");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player O's turn");
                currentPlayer = 1;
            }
            else {
                btnNine.setText("O");
                TextView playerStatus = findViewById(R.id.playerStatus);
                playerStatus.setText("Player X's turn");
                currentPlayer = 0;
            }
        }
    }

    public void newGame(View view) {
        // clears all buttons when new game is clicked
        Button btnOne = findViewById(R.id.btnOne);
        btnOne.setText("");
        Button btnTwo = findViewById(R.id.btnTwo);
        btnTwo.setText("");
        Button btnThree = findViewById(R.id.btnThree);
        btnThree.setText("");
        Button btnFour = findViewById(R.id.btnFour);
        btnFour.setText("");
        Button btnFive = findViewById(R.id.btnFive);
        btnFive.setText("");
        Button btnSix = findViewById(R.id.btnSix);
        btnSix.setText("");
        Button btnSeven = findViewById(R.id.btnSeven);
        btnSeven.setText("");
        Button btnEight = findViewById(R.id.btnEight);
        btnEight.setText("");
        Button btnNine = findViewById(R.id.btnNine);
        btnNine.setText("");
        TextView playerStatus = findViewById(R.id.playerStatus);
        playerStatus.setText("Player X's turn");
        currentPlayer = 0;
    }
}