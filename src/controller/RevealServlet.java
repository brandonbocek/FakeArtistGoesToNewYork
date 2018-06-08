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
 * Servlet implementation class RevealServlet
 */
@WebServlet("/RevealServlet")
public class RevealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RevealServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Game game = (Game)request.getSession().getAttribute("game");
		String firstName = (String)request.getParameter("playerName");
		
		FindCorrectPlayer fcp = new FindCorrectPlayer(game, firstName);
		Player playerToDisplay = fcp.getPlayerHint();
		
		boolean isFake = playerToDisplay.isTheFake();
		
		
		request.getSession().setAttribute("numberViews", playerToDisplay);
		request.getSession().setAttribute("hintToDisplay", playerToDisplay.getWordToSee());
		request.getSession().setAttribute("player", playerToDisplay);
		request.getSession().setAttribute("isFake", isFake);
		request.getRequestDispatcher("displayHint.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
