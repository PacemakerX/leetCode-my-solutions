#!/bin/bash

# Directory containing the LeetCode solutions
base_dir="solutions_leetCode"

# Iterate over all subdirectories
for folder in "$base_dir"/*/; do
    # Check if metadata.json exists in the subdirectory
    metadata_file="${folder}metadata.json"
    if [[ -f "$metadata_file" ]]; then
        # Remove the "code" field from the JSON file
        jq 'del(.code)' "$metadata_file" > "${metadata_file}.tmp" && mv "${metadata_file}.tmp" "$metadata_file"
        echo "Removed 'code' section from $metadata_file"
    else
        echo "No metadata.json found in $folder"
    fi
done

echo "Done! All 'code' sections have been removed from metadata.json files."
