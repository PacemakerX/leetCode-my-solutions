#!/bin/bash

# Function to capitalize the first letter of each word in README.md titles
capitalize_title() {
    # Loop through each folder in the solutions_leetCode directory
    for folder in solutions_leetCode/*; do
        # Check if it's a directory
        if [ -d "$folder" ]; then
            # Define the path to README.md
            readme_file="$folder/README.md"

            # Check if the README.md file exists
            if [ -f "$readme_file" ]; then
                # Extract the title from the README.md
                title_line=$(head -n 1 "$readme_file")

                # Capitalize the first letter of each word in the title
                capitalized_title=$(echo "$title_line" | sed -r 's/(\b[a-z])/\U\1/g')

                # Replace the original title in README.md with the capitalized version
                sed -i "1s/.*/$capitalized_title/" "$readme_file"

                echo "Title in $readme_file has been capitalized."
            else
                echo "README.md not found in $folder"
            fi
        fi
    done
}

# Run the function to capitalize titles in all README.md files
capitalize_title
