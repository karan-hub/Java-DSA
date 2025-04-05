import subprocess
import os

def run_git_command(command):
    result = subprocess.run(command, shell=True, capture_output=True, text=True)
    return result.stdout.strip()

def get_changed_files():
    output = run_git_command("git status --porcelain")
    files = [line[3:] for line in output.splitlines() if line]
    return files

def generate_commit_message(files):
    if not files:
        return "🔄 No changes detected"

    messages = []
    for file in files:
        if file.endswith(".java"):
            messages.append(f"🛠️ Modified {file}")
        elif file.endswith(".py"):
            messages.append(f"🛠️ Modified {file}")
        elif file.endswith(".html") or file.endswith(".css"):
            messages.append(f"🎨 Style change in {file}")
        elif file.lower().startswith("readme"):
            messages.append("📝 Updated README")
        else:
            messages.append(f"🔧 Changed {file}")
    return " | ".join(messages)

def main():
    if not os.path.exists(".git"):
        print("❌ Not a Git repository.")
        return

    files = get_changed_files()
    if not files:
        print("✅ Nothing to commit.")
        return

    commit_message = generate_commit_message(files)
    print(f"📋 Commit message: {commit_message}")

    run_git_command("git add .")
    run_git_command(f'git commit -m "{commit_message}"')
    run_git_command("git push")
    print("🚀 Pushed to remote.")

if __name__ == "__main__":
    main()
