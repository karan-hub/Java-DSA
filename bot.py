import tkinter as tk
from tkinter import scrolledtext

# Basic chatbot logic
def get_bot_response(user_input):
    user_input = user_input.lower()
    
    if "hello" in user_input or "hi" in user_input:
        return "Hello! How can I assist you today?"
    elif "order" in user_input:
        return "Could you please provide your order ID?"
    elif "status" in user_input:
        return "Checking the status... Please wait."
    elif "help" in user_input:
        return "Sure! I'm here to help. Ask me about your orders, delivery, or refund."
    elif "bye" in user_input:
        return "Goodbye! Have a great day!"
    else:
        return "Sorry, I didn't understand that. Can you rephrase?"

# Send message and get response
def send_message():
    user_input =  user_entry.get()
    if user_input is None:
        return
    chat_window.config(state=tk.NORMAL)
    chat_window.insert( tk.END,  "you : " +  user_input +"\n" )
    result = get_bot_response(user_input)
    chat_window.insert( tk.END ,"me : "   +   result +"\n\n")
    chat_window.config(state=tk.DISABLED)
    user_entry.delete(0 , tk.END)
    
    print("ok")

    
    
# GUI setup
root = tk.Tk() 

chat_window = scrolledtext.ScrolledText(root)
chat_window.grid(row=0 , column=0)

user_entry = tk.Entry(root)
user_entry.grid(row=1 , column=0)

submit = tk.Button(root , text="send" , command= send_message)
submit.grid(row=1 , column=2)

root.mainloop()


