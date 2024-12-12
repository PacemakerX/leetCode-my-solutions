#!/bin/bash

# Function to create folder and template files for a new solution
create_solution() {
    # Ask for the folder name (Question ID + Title Slug)
    read -p "Enter the folder name (questionid_title-slug): " folder_name

    # Create the folder for the solution
    solution_folder="solutions_leetCode/$folder_name"
    mkdir -p "$solution_folder"

    # Ask for details to populate the README and metadata.json
    read -p "Enter the submission ID: " submission_id
    read -p "Enter the Question ID: " question_id
    read -p "Enter the runtime (e.g., 47 ms): " runtime
    read -p "Enter the memory usage (e.g., 44.4 MB): " memory
    read -p "Enter the title of the problem: " title

    # Generate URL using submission ID
    url="/submissions/detail/$submission_id/"

    # Create the metadata.json without the code field
    metadata_json="$solution_folder/metadata.json"
    cat <<EOF > "$metadata_json"
{
  "id": $submission_id,
  "question_id": $question_id,
  "lang": "cpp",
  "lang_name": "C++",
  "timestamp": $(date +%s),
  "status": 10,
  "status_display": "Accepted",
  "runtime": "$runtime",
  "url": "$url",
  "is_pending": "Not Pending",
  "title": "$title",
  "memory": "$memory",
  "title_slug": "$(echo $title | tr '[:upper:]' '[:lower:]' | tr ' ' '-')",
  "has_notes": false,
  "flag_type": 1
}
EOF

    # Create the README.md file with the entered details
    readme_file="$solution_folder/README.md"
    cat <<EOF > "$readme_file"
# $title

**Question ID**: $question_id  
**Language**: C++  
**Status**: Accepted  
**Runtime**: $runtime  
**Memory**: $memory  

## Solution Code
\`\`\`cpp
// Solution code removed intentionally.
\`\`\`
EOF

    echo "Solution folder created: $solution_folder"
    echo "README.md and metadata.json files created successfully."
}

# Run the function to create a solution
create_solution
