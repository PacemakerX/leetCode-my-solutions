#!/bin/bash

# Path to your solutions directory
solutions_dir="solutions_leetCode"

# Recursively find all metadata.json files and remove compare_result field
find "$solutions_dir" -type f -name "metadata.json" | while read -r metadata_file; do
    # Use jq to remove the compare_result field from each metadata.json
    jq 'del(.compare_result)' "$metadata_file" > "$metadata_file.tmp" && mv "$metadata_file.tmp" "$metadata_file"
    echo "Removed compare_result from $metadata_file"
done

