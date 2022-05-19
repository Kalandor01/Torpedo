package torpedo;

import java.util.Scanner;

public class Torpedo
{

    static Scanner sc = new Scanner(System.in);

    final static int BOARD_SIZE = 7;

    public static String[] make_board()
    {
        String[] board = new String[BOARD_SIZE];
        for(int x=0; x<BOARD_SIZE; x++)
            board[x] = "_";
        return board;
    }
	
    public static String[] place_ship(String[] board_raw, int ship_size)
    {
        String[] board = board_raw.clone();
        int pos = (int)(Math.random() * (BOARD_SIZE - ship_size));
        int max_place = pos + ship_size;
        for(; pos<max_place; pos++)
            board[pos] = "#";
            pos++;
        return board;
    }

    public static void write(String[] board_p,String[] board_a)
    {
        for(int x=0; x<BOARD_SIZE; x++)
            System.out.print(board_p[x]);
        System.out.println();
        for(int x=0; x<BOARD_SIZE; x++)
            System.out.print(board_a[x]);
        System.out.println();
    }

    public static void write_won(int won)
    {
        if(won == -1)
            System.out.println("A gép nyert.");
        else
            System.out.println("Nyertél.");
    }

    public static String[] move_player(String[] board)
    {
        System.out.println("TEMPLATE");
        return board;
    }

    public static String[] move_ai(String[] board)
    {
        System.out.println("TEMPLATE");
        sc.next();
        return board;
    }

    public static boolean is_win(String[] board)
    {
        int x=0;
        for(; x<BOARD_SIZE && board[x] == "_"; x++) {}
        if(x>=BOARD_SIZE)
            return true;
        else
            return false;
    }


    public static void main(String[] args)
    {
        int won = 0;
        String[] board_base = make_board();
        int ship_size = 3;
        String[] board_ai = place_ship(board_base, ship_size);
        String[] board_player = place_ship(board_base, ship_size);
        while(won == 0)
        {
            write(board_player, board_ai);
            board_ai = move_player(board_ai);
            if(is_win(board_ai))
                won = -1;
            write(board_player, board_ai);
            if(won == 0)
            {
                board_player = move_ai(board_player);
                if(is_win(board_player))
                    won = 1;
            }
        }
        write_won(won);
    }
}
