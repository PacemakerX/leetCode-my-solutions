#!/bin/bash

# Function to remove the "time" field from metadata.json
remove_time() {
    # Loop through all folders in solutions_leetCode
    for dir in solutions_leetCode/*/; do
        # Check if the metadata.json file exists in the folder
        if [ -f "$dir/metadata.json" ]; then
            # Use jq to remove "time" field
            jq 'del(.time)' "$dir/metadata.json" > "$dir/temp_metadata.json" && mv "$dir/temp_metadata.json" "$dir/metadata.json"
            echo "Removed 'time' from $dir/metadata.json"
        else
            echo "metadata.json not found in $dir"
        fi
    done
}

# Call the function to execute
remove_time
