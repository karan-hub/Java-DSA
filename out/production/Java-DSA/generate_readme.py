import os

# Replace with your GitHub repository URL
GITHUB_REPO_URL = "git@github.com:karan-hub/Java-DSA.git"

def generate_readme(directory):
    readme_content = "# File Links\n\n"
    for root, _, files in os.walk(directory ):
        for file in files:
            file_path = os.path.relpath(os.path.join(root, file), directory)
            github_link = f"{GITHUB_REPO_URL}/blob/main/{file_path}"
            readme_content += f"- [{file_path}]({github_link})\n"
    
    with open(os.path.join(directory, "README2.md"), "w") as readme_file:
        readme_file.write(readme_content)

if __name__ == "__main__":
    generate_readme("/home/karan/Desktop/Java-DSA")
