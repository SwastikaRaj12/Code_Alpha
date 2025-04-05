import java.util.Scanner;

public class AIChatbot {

    // Method to process user input and generate a response
    public static String getResponse(String input) {
        // Normalize input (convert to lowercase for easier comparison)
        input = input.toLowerCase();

        // Check for common responses based on input
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a chatbot, but I'm doing fine, thank you!";
        } else if (input.contains("your name")) {
            return "I am your AI chatbot.";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a great day!";
        } else if (input.contains("thank you")) {
            return "You're welcome! Feel free to ask if you need more help.";
        } else {
            return "Sorry, I don't understand that. Can you ask something else?";
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("AI Chatbot: Hello! I'm your chatbot. Type 'bye' to exit.");

        // Continuously read user input until they type 'bye'
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            // Check if the user typed 'bye' to end the conversation
            if (userInput.toLowerCase().equals("bye")) {
                System.out.println("AI Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Get the chatbot's response and print it
            String response = getResponse(userInput);
            System.out.println("AI Chatbot: " + response);
        }

        scanner.close();
    }
}
