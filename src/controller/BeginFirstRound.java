package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Game;
import model.Player;

/**
 * Servlet implementation class BeginFirstRound
 */
@WebServlet("/BeginFirstRound")
public class BeginFirstRound extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeginFirstRound() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Game game = (Game)request.getSession().getAttribute("game");
		String firstName, emailAddress;
		
		for(int i=1;i<=game.getNumOfPlayers();i++){
			firstName = request.getParameter("fname"+i);
			emailAddress = request.getParameter("email"+i);
			game.addPlayer(firstName, emailAddress);
			
		}
		
		WordFinder w = new WordFinder(game);
		int roundNum = w.setWordToGame();
		
		request.getSession().setAttribute("game", game);
		request.getSession().setAttribute("roundNum", roundNum);
		request.getRequestDispatcher("noEmail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

